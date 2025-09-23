"use strict"

/*
   Assignment 1

   Debug
   Author: Judah Csanyi
   Date: 05/09/2025 
*/

const classes = [{
   course: "PROG2100",
   desc: "Learn to Program in C++",
   time: "Mon 8:30 - 10:30<br>Wed 11:30 - 1:30"
},
{
   course: "INET2005",
   desc: "A continuation from web development where we continue to learn how to build web pages",
   time: "Mon 10:30 - 12:30<br>Wed 8:30 - 10:30"
},
{
   course: "ICOM2702",
   desc: "A continuation from prof practives from year 1 where we learn how to become a professional programer",
   time: "Mon 1:30 - 3:30<br>Fri 1:30 - 3:30"
},
{
   course: "PROG2200",
   desc: "This course teaches advanced topics for programming going off the basic knowledge of Java",
   time: "Tue 8:30 - 10:30<br>Thur 8:30 - 10:30"
},
{
   course: "INFT2100",
   desc: "Teaches students how to manage and make a programming project, continuation form SAAD",
   time: "Tue 11:30 - 1:30<br>Thur 11:30 - 1:30"
},
{
   course: "MOBI3002",
   desc: "Students learn how to program android apps",
   time: "Wed 1:30 - 3:30<br>Fri 11:30 - 1:30"
}]


var htmlCode = "<table>";
htmlCode += "<thead>";
htmlCode += "<tr>";
htmlCode += "<th>Course</th>";
htmlCode += "<th>Description</th>";
htmlCode += "<th>Time</th>";
htmlCode += "</tr>";
htmlCode += "</thead>";
htmlCode += "<tbody>";

for (var i=0; i<=5; i++) {
   htmlCode += "<tr>";
   htmlCode += "<td>";
   htmlCode += classes[i].course;
   htmlCode += "</td>";
   htmlCode += "<td>";
   htmlCode += classes[i].desc;
   htmlCode += "</td>";
   htmlCode += "<td>";
   htmlCode += classes[i].time;
   htmlCode += "</td>";
   htmlCode += "</tr>";
}

htmlCode += "</tbody>";
htmlCode += "</table>";

document.getElementById("list").innerHTML = htmlCode;
