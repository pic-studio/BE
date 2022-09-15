package com.picstudio.sideproject.reservation.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer headCount;

    @Column
    private boolean reservationState;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @Column
    @JsonFormat(pattern = "hh:mm")
    private LocalTime time;

    @Column
    private Long userId;

    @Column
    private Long studioId;

    //Todo : 2022/09/15 디폴트 0이 아닐때 다른 방법 사용
//    @ColumnDefault(false) // default = 0
    @Column(columnDefinition = "boolean default false")
    private boolean isDeleted;

    //생성자
    @Builder
    public Reservation(Integer headCount, boolean reservationState, LocalDate date, LocalTime time) {
        this.headCount = headCount;
        this.reservationState = reservationState;
        this.date = date;
        this.time = time;
    }
}
