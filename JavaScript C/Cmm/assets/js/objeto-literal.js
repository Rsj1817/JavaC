const personaje = {
    nombre: 'Mark',
    codeName: 'Hulk',
    vivo: false,
    edad: 30,
    coords :{
        lat:34.567,
        lng:-188.89
    },
    trajes:['Camisa','Pantalon','Short'],
    direccion:{
        zip:'1080, 90234',
        ubicacion: 'Malibu, California'
    },
    'ultima-pelicula':'Invierno frio'

};



console.log('Nombre',personaje.nombre);
console.log('Nombre del personaje ',personaje['nombre']);
console.log(personaje.direccion.zip);

//Conseguir la cantidad de trajes
console.log("La cantidad de trajes es " , personaje.trajes.length);

console.log("Ultimo traje es  ", personaje.trajes[personaje.trajes.length-1]);

const x  = 'vivo';
console.log('Vivo',personaje[x]);

console.log(personaje["ultima-pelicula"]);



//Mas detalles
delete personaje.edad;
console.log(personaje);
personaje.casado=true;

const entriesPares = Object.entries(personaje);
console.log(entriesPares);

/*personaje = 'Hello world';
console.log(personaje);
*/

Object.freeze(personaje);
personaje.dinero = 10000000000000;
console.log(personaje);
personaje.casado = false;

personaje.direccion.ubicacion = 'Mexico';

const propiedades = Object.getOwnPropertyNames(personaje);
const valores = Object.values(personaje);
console.log({propiedades});
console.log({valores});