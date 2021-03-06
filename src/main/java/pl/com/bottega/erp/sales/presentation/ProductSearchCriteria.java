/*
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.com.bottega.erp.sales.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Slawek
 */
public class ProductSearchCriteria implements Serializable {
    public enum ProductSearchOrder {
        NAME, PRICE;
    }

    // constraints
    private String containsText;
    private Double maxPrice;
    private Collection<Long> specificProductIds = new ArrayList<Long>();
    //
    private ProductSearchOrder orderBy = ProductSearchOrder.NAME;
    private boolean ascending = true;

    // pagination support
    private int pageNumber = 1;
    private int itemsPerPage = 50;

    public String getContainsText() {
        return containsText;
    }

    public void setContainsText(String containsText) {
        this.containsText = containsText;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Collection<Long> getSpecificProductIds() {
        return specificProductIds;
    }

    public void setSpecificProductIds(Collection<Long> specificProductIds) {
        this.specificProductIds = specificProductIds;
    }

    public boolean hasSpecificProductIdsFilter() {
        return specificProductIds != null && !specificProductIds.isEmpty();
    }

    public ProductSearchOrder getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(ProductSearchOrder orderBy) {
        this.orderBy = orderBy;
    }

    public boolean isAscending() {
        return ascending;
    }

    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber < 1) {
            this.pageNumber = 1;
        } else {
            this.pageNumber = pageNumber;
        }
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        if (itemsPerPage < 1) {
            this.itemsPerPage = 1;
        } else {
            this.itemsPerPage = itemsPerPage;
        }
    }
}
