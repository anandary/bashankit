/* General Styles */
body {
    font-family: 'Arial', sans-serif;
    background: linear-gradient(135deg, #2196F3, #90CAF9);
    color: white;
    text-align: center;
    overflow-x: hidden;
}

h1, h2 {
    font-size: 3rem;
    text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.3);
}

button {
    background-color: #FFEB3B;
    color: black;
    padding: 15px 30px;
    border: none;
    font-size: 1.2rem;
    cursor: pointer;
    border-radius: 20px;
    transition: transform 0.3s;
}

button:hover {
    transform: scale(1.1);
}

/* Hero Section */
#hero {
    margin-top: 50px;
    padding: 50px;
    background: rgba(0, 0, 0, 0.5);
    border-radius: 20px;
    box-shadow: 0 4px 20px rgba(0, 0, 0, 0.3);
}

/* Hidden Content */
.hidden {
    display: none;
}

/* Timeline Section */
.timeline {
    margin: 30px auto;
    padding: 20px;
}

.timeline-item {
    margin: 15px 0;
    background: #0288D1;
    padding: 10px;
    border-radius: 10px;
    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.2);
}

/* Treasure Hunt */
.star {
    display: inline-block;
    font-size: 2rem;
    color: gold;
    margin: 10px;
    cursor: pointer;
}

.star:hover {
    transform: scale(1.2);
    color: white;
}

/* Personalized Message */
.message {
    margin-top: 30px;
    padding: 20px;
    background: rgba(0, 0, 0, 0.6);
    border-radius: 20px;
    color: #FFEB3B;
}
