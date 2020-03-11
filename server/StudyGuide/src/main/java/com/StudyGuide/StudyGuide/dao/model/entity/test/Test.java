package com.StudyGuide.StudyGuide.dao.model.entity.test;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="test")
public class Test {

@Column(name="test_id")
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Setter @Getter
private Long testId;

@Column(name="test_name")
@Setter @Getter
private String testName;
}
