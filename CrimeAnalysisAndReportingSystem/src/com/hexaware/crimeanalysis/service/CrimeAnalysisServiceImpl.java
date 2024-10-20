package com.hexaware.crimeanalysis.service;

import java.util.Collection;
import java.util.List;

import com.hexaware.crimeanalysis.dao.CrimeAnalysisDaoImpl;
import com.hexaware.crimeanalysis.dao.ICrimeAnalysisDao;
import com.hexaware.crimeanalysis.entity.Case;
import com.hexaware.crimeanalysis.entity.Incident;
import com.hexaware.crimeanalysis.entity.Report;
import com.hexaware.crimeanalysis.myexceptions.IncidentNumberNotFoundException;

public class CrimeAnalysisServiceImpl implements ICrimeAnalysisService { 
	private CrimeAnalysisDaoImpl dao;

public CrimeAnalysisServiceImpl() {
    this.dao = new CrimeAnalysisDaoImpl();
}

@Override
public boolean createIncident(Incident incident) {
    return dao.createIncident(incident);
}

@Override
public boolean updateIncidentStatus(String newStatus, int incidentId) throws IncidentNumberNotFoundException {
    return dao.updateIncidentStatus(newStatus, incidentId);
}

@Override
public Collection<Incident> getIncidentsInDateRange(String startDate, String endDate) {
    return dao.getIncidentsInDateRange(startDate, endDate);
}

@Override
public Collection<Incident> searchIncidents(String criteria) {
    return dao.searchIncidents(criteria);
}

@Override
public Report generateIncidentReport(Incident incident) {
    return dao.generateIncidentReport(incident);
}

@Override
public Case createCase(String caseDescription, int incidentId) {
    return dao.createCase(caseDescription, incidentId);
}

@Override
public Case getCaseDetails(int caseId) throws IncidentNumberNotFoundException {
    return dao.getCaseDetails(caseId);
}

@Override
public boolean updateCaseDetails(Case caseObj) throws IncidentNumberNotFoundException {
    return dao.updateCaseDetails(caseObj);
}

@Override
public List<Case> getAllCases() {
    return dao.getAllCases();
}

}
