package com.pureamorous.eccommerceresourceserver.service;

import com.pureamorous.eccommerceresourceserver.dto.ProductResponseDto;
import com.pureamorous.eccommerceresourceserver.dto.ProductResponseListDto;
import com.pureamorous.eccommerceresourceserver.specification.ProductSpecParams;

public interface IProductService {

    ProductResponseDto getProductById(long productId);
    ProductResponseListDto getProductList(ProductSpecParams specParams);

}
