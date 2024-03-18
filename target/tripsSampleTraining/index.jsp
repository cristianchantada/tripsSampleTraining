<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="tripsSampleTraining.*"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.lang.reflect.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seleccionar viajes por duración</title>
</head>
<body>
	<h2>Viajes con duración superior a 331 minutos</h2>
	<%
	
		List<trips> listTrips = new ArrayList<>();
		TripsDao tripsDao = new TripsDao();
		int minDuration = 331;
		int maxDuration = 9999;
		
		listTrips = tripsDao.getByDuration(minDuration, maxDuration);

	    int i = 1;
	    for (trips trip : listTrips) {
	        Station startStationLocation = (Station) trip.getStartStationLocation();
	        Station endStationLocation = (Station) trip.getEndStationLocation();
	%>
	    <h3>Viaje número <%= i++ %>.</h3>
	    <ul>
	        <li><strong>Id de la bicicleta: </strong><%= trip.getBikeId() %></li>
	        <li><strong>Duración del viaje: </strong><%= trip.getTripDuration() %></li>
	        <li><strong>Hora de inicio: </strong><%= trip.getStartTime() %></li>
	        <li><strong>Hora de parada: </strong><%= trip.getStopTime() %></li>
	        <li><strong>Tipo de usuario: </strong><%= trip.getUserType() %></li>        
	        <li><strong>Tipo de usuario: </strong><%= trip.getBirthYear() %></li>
	        <br>
	        <li><strong>Estación de salida: </strong><%= trip.getStartStationName() %></li>
	        <li><strong>Tipo: </strong><%= startStationLocation.getType() %></li>

	        <% if (!startStationLocation.getCoordinates().isEmpty()) { %>
	            <li><strong>Longitud: </strong><%= startStationLocation.getCoordinates().get(0) %></li>
	        <% } else { %>
	            <li><strong>Longitud: </strong> desconocida </li>
	        <% } %>
	        <% if (startStationLocation.getCoordinates().size() > 1) { %>
	            <li><strong>Latitud: </strong><%= startStationLocation.getCoordinates().get(1) %></li>
	        <% } else { %>
	            <li><strong>Latitud: </strong> desconocida </li>
	        <% } %>
	        <br>
	        <li><strong>Estación de llegada: </strong><%= trip.getEndStationName() %></li>
	        <li><strong>Tipo: </strong><%= endStationLocation.getType() %></li>
	        <% if (!endStationLocation.getCoordinates().isEmpty()) { %>
	            <li><strong>Longitud: </strong><%= endStationLocation.getCoordinates().get(0) %></li>
	        <% } else { %>
	            <li><strong>Longitud: </strong> desconocida </li>
	        <% } %>
	        <% if (endStationLocation.getCoordinates().size() > 1) { %>
	            <li><strong>Latitud: </strong><%= endStationLocation.getCoordinates().get(1) %></li>
	        <% } else { %>
	            <li><strong>Latitud: </strong> desconocida </li>
	        <% } %>
	    </ul>
	<%
	    }
	%>

	
	
</body>
</html>