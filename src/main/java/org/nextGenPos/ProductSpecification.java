package org.nextGenPos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// Class ProductSpecification
@RequiredArgsConstructor
@Getter
public class ProductSpecification {
    private final ItemID itemID;
    private final Money price;
    private final String description;

}