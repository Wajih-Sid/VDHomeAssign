/**
 * Created by Wajih Sid on 10/29/2015.
 */


function createUser() {
    $.ajax({
        type: 'POST',
        url: 'createUser',
        data: $('#' + 'userForm').serialize(),
        success: function (user) {
            alert("Successfull in inserting " + user);
        }
    });
}

function updateUser() {
    $.ajax({
        type: 'PATCH',
        url: 'updateUser',
        data: $('#userForm').serialize(),
        success: function (user) {
            alert("Successfull in updating " + user);
        }
    });
}

function getUsers() {

    $.ajax({
        type: 'GET',
        url: 'fetchUser',
        data: $('#userFetchForm').serialize(),
        success: function (user) {
            if(user.length<1)
            {
                alert("No User found");
            }
            $('#results tbody').append('<tr></tr>');
            for (var property in user)
            {
                if (user.hasOwnProperty(property))
                {
                    $('#results tbody').append('<td>' + user[property] +'</td>');
                }
            }
        }
    });
}

function delUser() {

    id = $('#deleteUser').val();
    $.ajax({
        type: 'DELETE',
        url: 'delUser/'+id,
        success: function (message)
        {
            alert(message);
        }
    });
}

function getAllUsers() {
    $.ajax({
        type: 'GET',
        url: 'fetchAllUsers',
        success: function (users) {

            if(users.length<1)
            alert('No Users Found');

            for(i=0;i<users.length;i++)
            {
                for (var NAME in users[i])
                {
                    $('#results tbody').append('<tr></tr>');
                    if (users[i].hasOwnProperty(NAME)) {
                        $('#resultsAll').append('<td>' + users[i][NAME] + '</td>');
                    }
                }
            }
        }
    });
}