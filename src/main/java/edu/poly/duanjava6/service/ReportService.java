package edu.poly.duanjava6.service;

import java.util.List;

import edu.poly.duanjava6.report.ReportCost;
import edu.poly.duanjava6.report.ReportProduct;

public interface ReportService {
	List<ReportCost> reportCostInMonth(Integer month);
	List<ReportProduct> reportProductInMonth(Integer month);
}
