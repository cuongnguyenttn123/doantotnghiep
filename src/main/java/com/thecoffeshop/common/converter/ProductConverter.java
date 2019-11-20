package com.thecoffeshop.common.converter;

import com.thecoffeshop.DTO.ProductDTO;
import com.thecoffeshop.entity.Image;
import com.thecoffeshop.entity.Product;
import com.thecoffeshop.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Converter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ProductConverter {
    @Autowired
    PriceService priceService;
    public List<ProductDTO> converterDAOtoDTO(List<Product> productList){
        List<ProductDTO> productDTOS = new ArrayList<>();
        for (Product product: productList) {
            ProductDTO productDTO = new ProductDTO();
            productDTO.setProductid(product.getProductid());
            Set<Image> setImages = product.getImages();
            List<Image> images = new ArrayList<Image>();
            int size = setImages.size() - 1;
            for (Image image : setImages) {
                if (size <= 3) {
                    images.add(image);
                }
                size--;
            }
            productDTO.setImages(images);

            productDTO.setCategoryproductNAME(product.getCategoryproduct().getName());
            productDTOS.add(productDTO);
        }
        return productDTOS;
    }
}
