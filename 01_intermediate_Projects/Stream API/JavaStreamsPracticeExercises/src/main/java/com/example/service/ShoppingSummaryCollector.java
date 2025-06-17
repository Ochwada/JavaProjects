package com.example.service;


import com.example.model.*;

import java.util.*;
import java.util.function.*;

import java.util.stream.Collector;

/**
 * *******************************************************
 * Package: com.example.service
 * File: ShoppingSummaryCollector.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 4:43 PM
 * Description:
 * Objective:
 * *******************************************************
 */


public class ShoppingSummaryCollector
        implements Collector<Item, ShoppingSummaryCollector.ShoppingSummary, ShoppingSummaryCollector.ShoppingSummary> {

    /**
     * Represents a summary of a shopping cart containing multiple items.
     * <p>
     * This class accumulates:
     * <ul>
     *     <li>Total number of items</li>
     *     <li>Total price of all items</li>
     *     <li>Average price per item</li>
     * </ul>
     *
     * <p>
     * It is designed to be used as a mutable container for stream-based aggregations,
     * especially when creating custom collectors that summarize a list of {@link Item} objects.
     * </p>
     */
    public class ShoppingSummary {

        private int itemCount = 0;
        private double totalPrice = 0.0;

        /**
         * Accumulates data from a given {@link Item}.
         * Increments item count and adds the item's price to total price.
         *
         * @param item the item to accumulate
         */
        public void accumulate(Item item) {
            itemCount++;
            totalPrice += item.getPrice();
        }


        /**
         * Combines two {@code ShoppingSummary} instances.
         * <p>
         * Used internally when combining partial results during parallel stream processing.
         *
         * @param other another {@code ShoppingSummary} to combine with
         * @return this summary after combining values
         */
        public ShoppingSummary combine(ShoppingSummary other) {
            this.itemCount += other.itemCount;
            this.totalPrice += other.totalPrice;
            return this;
        }

        /**
         * Calculates the average price of items in the summary.
         *
         * @return average price, or 0 if no items have been accumulated
         */
        public double getAveragePrice() {
            return itemCount == 0 ? 0 : totalPrice / itemCount;
        }

        /**
         * Returns a string representation of the shopping summary.
         *
         * @return string containing item count, total price, and average price
         */
        @Override
        public String toString() {
            return "Shopping Summary:\n" +
                    "[Count = " + itemCount + "\n" +
                    "Total Price= € " + totalPrice + "\n" +
                    "Avg Price = € " + getAveragePrice() + " ]";
        }
    }

    /**
     * Provides the initial container for accumulation.
     */
    @Override
    public Supplier<ShoppingSummary> supplier() {
        return ShoppingSummary::new;
    }

    /**
     * Accumulates sentences into the current container.
     */
    @Override
    public BiConsumer<ShoppingSummary, Item> accumulator() {
        return ShoppingSummary::accumulate;
    }

    /**
     * Combines two partial results during parallel execution.
     */
    @Override
    public BinaryOperator<ShoppingSummary> combiner() {
        return ShoppingSummary::combine;
    }

    /**
     * Returns the final result after collecting.
     * In this case, we don't transform the container; so identity.
     */
    @Override
    public Function<ShoppingSummary, ShoppingSummary> finisher() {
        return Function.identity();
    }

    /**
     * Characteristics of this collector.
     */
    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH);
    }
}
