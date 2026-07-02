package daviddev.product_service.service;

import daviddev.product_service.controller.dto.ProductRequest;
import daviddev.product_service.controller.dto.ProductResponse;
import daviddev.product_service.model.Product;
import daviddev.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        Product product =  Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} has been created", product.getId());

    }

    public List<ProductResponse> getAllProducts() {
       List<Product> products = productRepository.findAll();

      return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse  mapToProductResponse(Product product ) {
        return  ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
