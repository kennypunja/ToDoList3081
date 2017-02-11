<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="google-signin-client_id" content="YOUR_CLIENT_ID.apps.googleusercontent.com">

    <title> List App </title>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js" integrity="sha384-3ceskX3iaEnIogmQchP8opvBy3Mi7Ce34nWjpBIwVTHfGYWQS9jwHDVRnpKKHJg7" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.3.7/js/tether.min.js" integrity="sha384-XTs3FgkjiBgo8qjEjBk0tGmf3wPrWtA6coPfQDfFEY8AnYJwjalXCiosYRBIBZX8" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.5/js/bootstrap.min.js" integrity="sha384-BLiI7JTZm+JWlgKa0M0kGRpJbF2J8q+qreVrKBC47e3K6BW78kGLrCkeRX6I9RoK" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.4.2/angular-ui-router.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular-animate.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular-sanitize.js"></script>
    <script src="https://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-2.3.0.js"></script>
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.5/css/bootstrap.min.css" integrity="sha384-AysaV+vQoT3kOAXZkl02PThvDr8HYKPZhNT5h/CXfBThSRXQ6jW5DO2ekP5ViFdi" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

    <style>
        <%@include file="/WEB-INF/resources/css/mainPage.css"%>
    </style>

</head>

<body>

<div class="row">
    <div class="col-sm-3 row-height">
        <h3 style= "margin-top: 20px" class="sm3Text"> To Do Lists </h3>
        <hr color="white">
        <ul class="list-group">
            <li class="sm3Text">
                <h5>List1</h5>
            </li>
            <li class="sm3Text">
                <h5>List2</h5>
            </li>
        </ul>
    </div>
    <div class="col-sm-9">
        <nav class="navbar navbar-light bg-faded">
            <div class="container-fluid">
                <h3 id="pullLeft"> Current List </h3>
                <button id="pullRight" class="btn btn-outline-success btn-sm " type="submit">Log Out </button>
                <button id="pullRight" class="btn btn-outline-success btn-sm " type="submit">Delete List</button>
                <button id="pullRight" class="btn btn-outline-success btn-sm " type="submit">Save List</button>
                <button id="pullRight" class="btn btn-outline-success btn-sm " type="submit">Create List</button>

            </div>
        </nav>

        <div style="margin-top: 10px" class="container" id="mainContainer">
            <ul class="list-group">
                <li id="listItem" class="list-group-item">
                    <h5> <strike>Task 1 </strike>
                        <button style="float:right"class="bnt btn-sm btn-outline-success" type="submit">
                            <span class="glyphicon glyphicon-arrow-down"></span>
                        </button>
                        <button style="float:right"class="bnt btn-sm btn-outline-success" type="submit">
                            <span class="glyphicon glyphicon-arrow-up"></span>
                        </button>
                        <button style="float:right"class="bnt btn-sm btn-outline-success" type="submit">
                            <span class="glyphicon glyphicon-trash"></span>
                        </button>
                        <button style="float:right"class="bnt btn-sm btn-outline-success" type="submit">
                            <span class="glyphicon glyphicon-pencil"></span>
                        </button>
                        <button style="float:right"class="bnt btn-sm btn-outline-success" type="submit">
                            <span class="glyphicon glyphicon-ok"></span>
                        </button>

                    </h5>
                </li>
                <li class="list-group-item">
                    <h5>Task 2

                    </h5>
                </li>
            </ul>

        </div>



    </div>

</div>



</body>

</html>