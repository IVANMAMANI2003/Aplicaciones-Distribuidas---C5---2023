document.addEventListener('DOMContentLoaded', function(){ //detector de eventos
    
    const websocketClient = new WebSocket("ws://localhost:12345/");
    
    const messageContainer = document.querySelector("#message_container");//QuerySelector es una funcion que consulta al objeto
    const messageinput = document.querySelector("[name=message_input]");
    const sendmessageButton = document.querySelector("[name=send_message_button]");

    websocketClient.onopen=function(){
        console.log("Client connected"); //

        sendmessageButton.onclick=function(){
            websocketClient.send(messageinput.value);
        };

        websocketClient.onmessage=function(message){
            const newMessage = document.createElement("div");
            newMessage.innerHTML=message.data;
            messageContainer.appendChild(newMessage);
        };
    };
}, false);