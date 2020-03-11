package com.StudyGuide.StudyGuide.dao.model.entity.test;

import com.sun.tools.javac.util.List;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="question")
public class Questions {
    @Column(name="question_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter
    private Long questionId;

    @Column(name="question")
    @Getter @Setter
    private String Question;

    @ManyToMany @Getter @Setter
            
    List<Answer> answers;
}
