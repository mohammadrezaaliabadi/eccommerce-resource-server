package com.pureamorous.eccommerceresourceserver.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductResponseListDto {
    private int totalPages;
    private long totalCount;
    private int pageIndex;
    private int pageSize;
    private List<ProductResponseDto> productList;

    public ProductResponseListDto(){
        productList = new ArrayList<ProductResponseDto>();
    }
}
