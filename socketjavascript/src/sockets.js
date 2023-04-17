module.exports=function(io){

    let nicknames=[];//usuarios que estan conectados en el servidor

    io.on('connection', socket =>{
        console.log('nuevo usuario conectado');

    socket.on('new user', (data, cb)=>{ //colback
        if (nicknames.indexOf(data)!=-1) { //diferente que menos 1, el cliente exixte
            cb(false);
        }else{
            cb(true);
            socket.nickname=data; //dentro de la propia coneccion de socket
            nicknames.push(socket.nickname);
            updateNicknames();
        }
    });

        socket.on('send message', function(data){
            io.sockets.emit('new message', {
                msg:data,
                nick:socket.nickname //se esta enviando mensaje y nombre user
            })
        });

        socket.on('disconnect', data=>{
            if (!socket.nickname) return; {
                nicknames.splice(nicknames.indexOf(socket.nickname), 1);//permite quitar desde el indice
                updateNicknames();
            }
        });
        function updateNicknames(){
            io.sockets.emit('usernames', nicknames);
        }
        
    });

}