//Local variables
let character;


window.addEventListener('load', main);

function main(){

    //Look for the elements in the DOM
    character = document.getElementById("character");

    //Select a speed to the moving of our character
    const SPEED = 10;


    //Add keydown event
    document.addEventListener('keydown',(event) =>{
        
        //1º Create a variable to can obtain the style of our character
        let styles = window.getComputedStyle(character);

        //2º Obtain value of his position
        let top = parseInt(styles.top);
        let left = parseInt(styles.left);

        //3º Set the different situations of our arrows
        //The parameter event have a special propertie that return a string
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
        character.style.top = top + 'px';
        character.style.left = left + 'px';
    });

}