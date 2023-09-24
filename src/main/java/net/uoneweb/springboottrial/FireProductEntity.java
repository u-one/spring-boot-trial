package net.uoneweb.springboottrial;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;
import lombok.Data;


@Data
@Document(collectionName = "products")
public class FireProductEntity {

  @DocumentId String id;

  private String name;

  String maker;

  private String productType;

  String productCode;

  private String parentCode;

  private String price;

  private String jan;

  private String releaseDate;

  private String detail;

  private String tags;

  private String icon;

  private String carsCount;

}
