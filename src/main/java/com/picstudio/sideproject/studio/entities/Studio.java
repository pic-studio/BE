package com.picstudio.sideproject.studio.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Studio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long userId;

    @Column
    private String studioName;

    @Column
    private Integer price;

    @Column
    private String studioIntegerro;

    @Column
    private String studioDetail;

    @Column
    private String description;

    @Column
    private String warnings;

    @Column
    private String address1;

    @Column
    private String address2;

    @Column
    private String mainImageUrl;

    @Column
    private String studioImagesUrl;

    @Column
    private Integer maxHeadCount;

    //Todo : 2022/09/15 디폴트 0이 아닐때 다른 방법 사용
//    @ColumnDefault(false) // default = 0
    @Column(columnDefinition = "boolean default false")
    private boolean isDeleted;

    // 생성자
    @Builder
    public Studio(Long userId, String studioName, Integer price, String studioIntegerro, String studioDetail, String description, String warnings, String address1, String address2, String mainImageUrl, String studioImagesUrl, Integer maxHeadCount) {
        this.userId = userId;
        this.studioName = studioName;
        this.price = price;
        this.studioIntegerro = studioIntegerro;
        this.studioDetail = studioDetail;
        this.description = description;
        this.warnings = warnings;
        this.address1 = address1;
        this.address2 = address2;
        this.mainImageUrl = mainImageUrl;
        this.studioImagesUrl = studioImagesUrl;
        this.maxHeadCount = maxHeadCount;
    }
}
