//Local variables
let character;


window.addEventListener('load', main);

function main(){

    //Look for the elements in the DOM
    character = document.getElementById("character");

    // Select a speed for moving the character
    const SPEED = 10;


    // Add keydown event listener
   // The variable that contains the document object allows us to access all DOM elements
    document.addEventListener('keydown',(event) =>{
        
        // 1º Create a variable to obtain the style of our character
        let styles = window.getComputedStyle(character);// This returns a CSS object, and we can only read its properties

        /// 2º Obtain the value of its position
        let top = parseInt(styles.top);// We get the value of the "top" style, which is a CSS value, and convert it to a number to work with
        let left = parseInt(styles.left);

        // 3º Handle the different arrow key cases
        // The event parameter has a special property that returns a string
        switch (event.key) {
            case 'ArrowUp':
                // Move up
                top -= SPEED; // Just subtract the speed to the current position
                break;
            case 'ArrowDown':
                // Move down
                top += SPEED; // Add speed to move down
                break;
            case 'ArrowLeft':
                // Move left
                left -= SPEED; // Move to the left
                break;
            case 'ArrowRight':
                // Move right
                left += SPEED; // Move to the right
                break;
        }

        // 4º Apply the new position to the character
        // We can't modify these values through the "styles" variable because it only allows us to read its properties
        character.style.top = top + 'px';
        character.style.left = left + 'px';
    });

}