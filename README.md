# My Solution for SVT Robotics recruiting assessment.
One of SVT's microservices calculates which robot should transport a pallet from point A to point B based on which robot is the closest and has the most battery left if there are multiple in the proximity of the load's location. You'll use a provided API endpoint to create a simplified robot routing API.

This is the endpoint to retrieve a list of robots in our robot fleet: https://60c8ed887dafc90017ffbd56.mockapi.io/robots. Note: if that URL doesn't work, a mirror is available here - https://svtrobotics.free.beeceptor.com/robots.

The provided API returns a list of all 100 robots in our fleet. It gives their current position on an xy-plane along with their battery life. Your job is to write a function which accepts arguments specifying a load that needs to be moved including its identifier and current x,y coordinates. Your function should make an HTTP request to the robots endpoint and return which robot is the best to transport the load based on which one is closest the load's location. If there is more than 1 robot within 10 distance units of the load, return the one with the most battery remaining.

The distance between two points is found with the following formula:

distance formula:
<img width="355" alt="image" src="https://user-images.githubusercontent.com/38884494/168158604-420e94b1-07a8-45fb-b9d1-b50342540166.png">


My function accepts three arguments:

loadId: a string containing an arbitrary ID of the load which needs to be moved.
x: a number indicating the x coordinate of the load which needs to be moved.
y: a number indicating the y coordinate of the load which needs to be moved.
My function return the id of the robot selected to to transport the load, as well as its distance to the goal and current battery level. (note: this is just an example, your results may be different depending on the data available from the API at the time.):

{
    robotId: 58,
    distanceToGoal: 49.9, //Indicates how far the robot is from the load which needs to be moved.
    batteryLevel: 30 //Indicates current battery level of the robot.
}

Requirements
Function that accepts and returns data per the above task description. You may code in any language you prefer.
Function can be run locally for testing.
Description of what features, functionality, etc. you would add next and how you would implement them. We want to know what you'd do next (and how you'd do it) if you had more time
Use git and GitHub for version control
Have fun! We're interested in seeing how you approach the challenge and how you solve problems with code. The goal is for you to be successful, so if you have any questions or something doesn't seem clear don't hesitate to ask. Asking questions and seeking clarification isn't a negative indicator about your skills - it shows you care and that you want to do well. Asking questions is always encouraged at SVT Robotics, and our hiring process is no different.
Deliverables Checklist

My is Function written in Java language
Function executes HTTP request and returns data per above requirements
