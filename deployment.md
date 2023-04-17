

# Deploying Your Website to GitHub Pages and Netlify

## GitHub Pages:

1. Add the following field at the top of your `package.json` file:

   ```json
   "homepage": "https://jsiqbal.github.io/router-dom-v6"
Add these two commands to the scripts block:


"predeploy": "npm run build",
"deploy": "gh-pages -d build"
To deploy, you need to install gh-pages as a dev dependency using the command:


npm i gh-pages -D
Make sure to install all other dependencies required for the build to work. To deploy, run the command:


npm run deploy
Netlify:
Create a Netlify account using your GitHub account.

Inside Netlify, install it in all the GitHub projects.

Select the projects and branches you want to deploy and just click on "Deploy".

sql
Copy code

You can simply copy and paste the above code into your README.md file in your 
