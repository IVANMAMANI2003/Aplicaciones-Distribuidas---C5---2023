import asyncio
import websockets

All_clients=[]

async def send_message(message:str):
    for client in All_clients:
        await client.send(message)
        
        
async def new_client_connected(client_socket, path): #client socket es el medio que se usara para hablar con el cliente
    print("New Client connected")
    All_clients.append(client_socket) #Agregamos todos los clientes a la lista d todos los clietes


    while True:
        new_message = await client_socket.recv()   #Primero escuchamos su mensaje y 
        print("Client sent: ", new_message)
        await send_message(new_message) # al enviar un mensaje, envia ua todos (llamamos a la funcion send_message)

async def start_server():
    print("Server start")
    await websockets.serve(new_client_connected, "localhost", 12345)

if __name__== '__main__':
    event_loop =asyncio.get_event_loop() #obtener ciclo de eventos para opeeaciones asincronicas
    event_loop.run_until_complete(start_server()) #ejecucucion del servidor
    event_loop.run_forever()# ejecucion infinita