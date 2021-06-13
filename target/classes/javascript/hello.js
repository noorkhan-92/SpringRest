$(document).ready(function(){
    alert("document loaded");
});

$("#getusers").click(function(){
  $.get("localhost:8080/users", function(data, status){
    alert("Data: " + data + "\nStatus: " + status);
  });
});