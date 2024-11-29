let categories = new Array();
let limpieza = new Array();
let lacteos = new Array();
let reposteria = new Array();
let vegetales = new Array();
let carnes = new Array();

//Productos 
//Producto de la categoría limpieza
limpieza = [
    {
        balletas: {
            marca : 'Ball',
            precio : 2.40,
            descripcion : 'Las mejores balletas para limpiar'

        },
        friegaSuelos: {
            marca : 'CleanFloor',
            precio : 3.40,
            descripcion : 'Deja tu suelo como los choros de oro'
        },
        suavizante: {
            marca : 'FreshClothe',
            precio : 4.00,
            descripcion : 'Dejará tu ropa fresca y con olor a rosas'
        }
    }
]
 //Producto de la categoría lacteos
 lacteos = [
    {
        leche: {
            marca : 'Hacendado',
            precio : 4.40,
            descripcion : 'La mejor leche hecha por Asturias'

        },
        yogur: {
            marca : 'Danone',
            precio : 3.40,
            descripcion : 'El mejor sabor y textura que podrás encontrar en un yogur'
        },
        queso: {
            marca : 'Villajos',
            precio : 7.00,
            descripcion : 'Sabor intenso y con aroma a almendras'
        }
    }
]
 //Producto de la categoría reposteria
 reposteria = [
    {
        galletas: {
            marca : 'María',
            precio : 3.10,
            descripcion : 'Crujiente y con aroma a vainilla'

        },
        tartas: {
            marca : 'Azucren',
            precio : 5.00,
            descripcion : 'Una tarta jugosa y cremosa para los más dulceros'
        },
        cupcakes: {
            marca : 'Empire Cake',
            precio : 2.30,
            descripcion : 'Pequeño pero altamente delicioso'
        }
    }
]
 //Producto de la categoría vegetales
 vegetales = [
    {
        lechuga: {
            marca : 'Eva',
            precio : 0.90,
            descripcion : 'Verde y fresca, recien recogida de la huerta'

        },
        zanahorias: {
            marca : 'Bonanza',
            precio : 1.40,
            descripcion : 'Las zanahorias favoritos de los conejos'
        },
        cebollas: {
            marca : 'MarChite',
            precio : 2.40,
            descripcion : 'Te hará llorar como a un bebé'
        }
    }
]
 //Producto de la categoría carnes
 carnes = [
    {
        pollo: {
            marca : 'Jupe',
            precio : 5.30,
            descripcion : 'Las carne más fresca y jugosa que podrás encontrar'

        },
        vacuno: {
            marca : 'Jupe',
            precio : 7.80,
            descripcion : 'Las carne más fresca y jugosa que podrás encontrar'
        },
        cordero: {
            marca : 'Jupe',
            precio : 5.40,
            descripcion : 'Las carne más fresca y jugosa que podrás encontrar'
        }
    }
]

categories = [
    limpieza,
    lacteos,
    reposteria,
    vegetales,
    carnes
]



function main(){
    
}












window.addEventListener('load',main);