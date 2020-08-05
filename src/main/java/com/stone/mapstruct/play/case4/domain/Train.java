package com.stone.mapstruct.play.case4.domain;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id", "destination", "type"})
@Entity
@Table(name = "trains")
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String destination;
    private TrainType type;
    private Long price;
    private String feature;

    public void setType(TrainType type) {
        this.type = type;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
