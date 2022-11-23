#include <fstream>
#include <iostream>
#include <math.h>

using namespace std;

const int wym_x = 20;
const int wym_y = 20;
const int start_x = 3;
const int start_y = 4;
const int cel_x = 17;
const int cel_y = 18;
float g[wym_x][wym_y] = {};
float f[wym_x][wym_y] = {};
int direction[wym_x][wym_y];
int open[wym_x][wym_y];
double h[wym_x][wym_y];

double licz_h(int poz_x, int poz_y) {
	double h = sqrt(pow(poz_x - cel_x, 2) + pow(poz_y - cel_y, 2));
	return h;
}

int main() {
    string nazwa="grid.txt";
    int tab[wym_x][wym_y];
    for(int i=0;i<wym_x;i++)
         for(int j=0;j<wym_y;j++)
            tab[i][j]=0;
    ifstream plik(nazwa);
    for(int i=0;i<wym_x;i++)
        for(int j=0;j<wym_y;j++)
            plik>>tab[i][j];
    plik.close();
    for(int i=0;i<wym_x;i++) {
        for(int j=0;j<wym_y;j++)
            cout<<" "<<tab[i][j];
        cout<<"\n";
    }
	for (int i = 0; i < wym_x; i++) {
		for (int j = 0; j < wym_y; j++) {
			h[i][j] = licz_h(i, j);
		}
	}
    int X, Y = 0;
	open[X][Y] = 1;

	while (!(open[wym_x][wym_y] == NULL)) {

		if (X == cel_x && Y == cel_y) {
			while (!(X == start_x && Y == start_y)) {
				tab[X][Y] = 3;
                if (direction[X][Y] == 1) Y-= 1;
                else if (direction[X][Y] == 2) Y+= 1;
                else if (direction[X][Y] == 3) X+= 1;
                else if (direction[X][Y] == 4) X-= 1;
			}
			cout << endl << endl;
			tab[X][Y] = 3;
			for (int i = 0; i < wym_x; i++)
			{
				for (int j = 0; j < wym_y; j++)
				{
					cout<<" "<<tab[i][j];
				}
				cout << endl;
			}
			getchar();
			return 0;
		}
		else {
			open[X][Y] = 2;
			if (X > start_y) {
				if (tab[X - 1][Y] == 0 && (open[X - 1][Y] == 0 )) {
					open[X - 1][Y] = 1;
					g[X - 1][Y] = g[X][Y] + 1;
					f[X][Y] = g[X][Y] + licz_h(X, Y);
					direction[X - 1][Y] = 3;
				}
			}

			if (X < cel_x) {
				if (tab[X + 1][Y] == 0 && (open[X + 1][Y] == 0 )) {
					open[X + 1][Y] = 1;
					g[X + 1][Y] = g[X][Y] + 1;
					f[X][Y] = g[X][Y] + licz_h(X, Y);
					direction[X + 1][Y] = 4;
				}
			}
			if (Y > start_x) {
				if (tab[X][Y - 1] == 0 && (open[X][Y - 1] == 0 )) {
					open[X][Y - 1] = 1;
					g[X][Y - 1] = g[X][Y] + 1;
					f[X][Y] = g[X][Y] + licz_h(X, Y);
					direction[X][Y - 1] = 2;
				}
			}
			if (Y < cel_y) {
				if (tab[X][Y + 1] == 0 && (open[X][Y + 1] == 0 )) {
					open[X][Y + 1] = 1;
					g[X][Y + 1] = g[X][Y] + 1;
					f[X][Y + 1] = g[X][Y] + licz_h(X, Y);
					direction[X][Y + 1] = 1;
				}
			}
		}
        float mini = 10000;
		for (int i = 0; i < wym_x; i++) {
			for (int j = 0; j < wym_y; j++) {
				if (open[i][j] == 1) {
					if (mini > f[i][j]) {
						mini = f[i][j];
						X = i;
						Y = j;
					}
				}
			}
		}
	}
}
