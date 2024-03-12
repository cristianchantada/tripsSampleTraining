<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="tripsSampleTraining.trips"%>
<%@ page import="tripsSampleTraining.TripsDao"%>
<%@ page import="tripsSampleTraining.Station"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
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
	
		for(trips trip : listTrips){
			int i = 1;
			Station startStationLocation = (Station)trip.getStartStationLocation();
			Station endStationLocation = (Station)trip.getEndStationLocation();			
			
	%>
		<h3>Viaje número <%= i %>.</h3>
		<ul>
			<li><strong>Id de la bicicleta: </strong><%= trip.getBikeId() %></li>
			<li><strong>Duración del viaje: </strong><%= trip.getTripDuration() %></li>
			<li><strong>Hora de inicio: </strong><%= trip.getStartTime() %></li>
			<li><strong>Hora de parada: </strong><%= trip.getStopTime() %></li>
			<li><strong>Tipo de usuario: </strong><%= trip.getUserType() %></li>
			<li><strong>Año de nacimiento: </strong><%= trip.getBirthYear() %></li>
			<br>
			<li><strong>Estación de salida: </strong><%= trip.getStartStationName() %></li>
			<li><strong>Tipo: </strong><%= startStationLocation.getType() %></li>
			<li><strong>Longitud: </strong><%= startStationLocation.getCoordinates().get(0) %></li>
			<li><strong>Latitud: </strong><%= startStationLocation.getCoordinates().get(1) %></li>
			<br>
			<li><strong>Estación de llegada: </strong><%= trip.getEndStationName() %></li>
			<li><strong>Tipo: </strong><%=  endStationLocation.getType() %></li>
			<li><strong>Longitud: </strong><%= endStationLocation.getCoordinates().get(0) %></li>
			<li><strong>Latitud: </strong><%= endStationLocation.getCoordinates().get(1) %></li>	
		</ul>			
	<%		
		}
	%>
	
	
	<h2>Solo 1 viaje</h2>
	<%
	
		trips onlyTrip = new trips();
		onlyTrip = tripsDao.get("379");
		if(onlyTrip != null){
		
	%>
	
	
	
	<p><%= onlyTrip.getBikeId() %></p>
	<p><%= onlyTrip.getStartTime() %></p>
	<p><%= onlyTrip.getStopTime() %></p>
	<p><%= onlyTrip.getUserType() %></p>
	
	
	<%} %>
	
</body>
</html>