# monte-carlo

> *"Creativity is the ability to introduce order into the randomness of nature"* - Eric Hoffer

## What is this program about?
This program is about simulation using monte carlo algorithm in order to estimate $\pi$ value. Monte carlo is an algorithm to simulate stochastic events based on certain distribution and for this purpose it is just simple uniform distribution. <br>

<img src="img/preview.JPG" alt="monte-carlo-preview" width="400"/>

*Finished state of the program*

The idea behind this program is to simulate randomized dot marking in each timestep in a space of a circle that is enclosed within a square. We count and separate the dots as follows:
- **Blue dots**: the dots that lie within the circle.
- **Red dots**: the dots that lie outside the circle and within the square.

The ratio of circle and square area will be approximated better to its true value as the number of dots gets larger. Because of the same probability of dots falling in each pixel in the square, we can conclude that portion of the dots in each area correlates linearly with the area of circle and square, as follows: <br> <br>
`circle_area = number_of_blue_dots`<br>
`square_area = number_of_blue_dots + number_of_red_dots`
I am in <span style="font-family:Papyrus; font-size:4em;">LOVE!</span>
`
\frac{n!}{k!(n-k)!}
`
<span style="font-size:larger;">word</span>


## What things that I learned during the process?




## What to do next?
This is the project as part of learning process using Java programming language. The program is not finished yet, because there is 'freeze' effects due to the waiting time for the finished state to be displayed. In the next version I will add `event listeners` to better visualize the process of the simulation.

## Resources

