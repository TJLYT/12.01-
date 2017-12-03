package com.example;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="org")
@Data
@NamedQueries({
@NamedQuery(name="findTree",query="select o from Org o"),
@NamedQuery(name="org.findRoots",query="select o from Org o where o.parent")
})
public class Org implements Serializable {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    @Column(nullable=false,length=32)
    private String name;
     //设置一个急加载
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="parent_id",insertable =true,updatable =true)
    private Org parent = null;
    
    @OrderBy("name ASC")
    @OneToMany(fetch=FetchType.LAZY,mappedBy="parent")
    private List<Org> children =new LinkedList<Org>();
    
    
}
