import sqlite3
from faker import Faker
import random
f = Faker()
nombre = f.name()
edad = random.randint(1,90)
#nombre = f.name()
#print(nombre,edad)
conexion = sqlite3.connect("base.sqlite3")
cursor = conexion.cursor()

cursor.execute("CREATE TABLE IF NOT EXISTS usuarios (id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, edad INTEGER)")
cursor.execute('INSERT INTO usuarios (nombre, edad) VALUES (?, ?)', (nombre, edad))
#la db tiene los elementos id, nombre, edad
conexion.commit()

cursor.execute("SELECT * FROM usuarios")
filas = cursor.fetchall()
for fila in filas:
    print(fila)
conexion.close()