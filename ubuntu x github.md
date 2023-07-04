configuring github from terminal:

Open a terminal on your Ubuntu system.

Install the gh command-line tool by running the following command:

sudo apt-key adv --keyserver keyserver.ubuntu.com --recv-key C99B11DEB97541F0
sudo apt-add-repository https://cli.github.com/packages
sudo apt update
sudo apt install gh


This will add the GitHub CLI repository to your system's package sources and install the gh tool.

then:


After the installation, you can log in to your GitHub account using the gh tool. Run the following command and follow the prompts:

gh auth login

# customization of zsh

sudo nano ~/.zshrc
