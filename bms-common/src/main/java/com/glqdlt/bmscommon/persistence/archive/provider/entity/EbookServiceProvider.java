package com.glqdlt.bmscommon.persistence.archive.provider.entity;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-04-02
 */

@Entity
@Accessors(chain = true)
@Data
@ToString
public class EbookServiceProvider {

    @Column(name = "providerId")
    @Id
    @GeneratedValue
    private int no;

    @Column(unique = true)
    private String name;
    private String url;

}
