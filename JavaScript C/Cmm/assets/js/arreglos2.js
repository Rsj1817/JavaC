let juegos = ['Zelda','Mario','JSZ','ZEUS'];

console.log('Largo: ' , juegos.length);

let primero = juegos[2-2];
let ultimo = juegos[juegos.length-1];

console.log(ultimo);

juegos.forEach( (elemento, indice, arr) => {
    console.log(elemento, indice, arr)
});

let nuevaLongitud = juegos.push('Mortal');

console.log('La nueva longitud es ',{nuevaLongitud, juegos});


nuevaLongitud = juegos.unshift( 'Mobil Leyends' );
console.log('La nueva longitud es ',{nuevaLongitud, juegos});

juegoBorrado = juegos.pop();
console.log({juegoBorrado, juegos});

console.log(juegos);
let pos = 1;
let juegosBorrados = juegos.splice(pos, 2);

console.log({juegosBorrados, juegos});

let zeusIndex = juegos.indexOf('ZEUS');
console.log(zeusIndex);