
$(function(){
    const socket = io();
    //obteniendo del DOM de los interfaces
    const $messageForm = $('#message-form');
    const $messageBox = $('#message');
    const $chat= $('#chat');

    //Obtenienedo elementos desde nicknameForm
    const $nickForm = $('#nickForm');
    const $nickError = $('#nickError');
    const $nickname = $('#nickname');

    const $users =$('#usernames')

    //
    $nickForm.submit(e=>{
        e.preventDefault();//para que la pagina no se refresque
        socket.emit('new user', $nickname.val(), data=>{ //primero se envia al servidor y data es lo que espera la respuesta del servidor
            if (data) {
                $('#nickWrap').hide();//si es verdad va a ocultar el contenedor
                $('#contentWrap').show(); //mostrara el chat
            } else {
                $nickError.html(`<div class="alert alert-danger">El ususario ya existe</div>`);
            } 
            $nickname.val('');//limpiando
        });
    });

    //eventos
    $messageForm.submit(e=>{
        e.preventDefault();
        socket.emit('send message', $messageBox.val());
        $messageBox.val('');
    });

    socket.on('new message', function(data){
        $chat.append('<b>'+`<div class="bg-success p-2 text-white">${data.nick} </div>`+'<b/>: ' + data.msg + '<br/>');
    });
    
    socket.on('usernames', data =>{ //data : arreglos que se obtuvo del servidor
        let html='';
        for (let i = 0; i < data.length; i++) { //longitud del arreglo
            html +=`<p><i class="fas fa-user"></i>${data[i]}</p>` //estamos agregando en etiquetas
            
        }
        $users.html(html);
    });
})