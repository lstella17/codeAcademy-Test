//package com.example.student.entity;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//public class Book {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	
//	@Column(unique = true)
//	private String name;
	
//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "book_subject", 
//			joinColumns = @JoinColumn(name="book_id"),
//			inverseJoinColumns = @JoinColumn(name="subject_id"))
//	private List<Subject> subjects;

//}
