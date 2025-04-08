package edu.poly.duanjava6.report;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ReportCategory implements Serializable{
	@Id
	public String id;
	public String name;
	public Long qty;
}
