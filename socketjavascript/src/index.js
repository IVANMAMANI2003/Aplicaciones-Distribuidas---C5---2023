const http = require('http');
const path =require('path');

const express= require('express');
const socketio = require('socket.io');

const app=express();
const server = http.createServer(app);
const io = socketio(server, { transports: ['websocket', 'polling'] });

//configuracion
app.set('port', process.env.PORT||8282)

require('./sockets')(io);

//archivos estaticos
app.use(express.static(path.join(__dirname, 'public')));
//iniciando servidor
server.listen(app.get('port'),()=>{
    console.log('servidor en el puerto ', app.get('port'));
});