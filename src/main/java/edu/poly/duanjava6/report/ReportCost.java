package edu.poly.duanjava6.report;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ReportCost implements Serializable{
	@Id
	public Date date;
	public Long sumOrder;
	public Double cost;
}
