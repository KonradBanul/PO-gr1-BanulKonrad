#include <fstream>
#include <iostream>
#include <math.h>

using namespace std;

const int wym_x = 20;
const int wym_y = 20;
const int start_x = 0;
const int start_y = 1;
const int cel_x = 14;
const int cel_y = 17;
int g[wym_x][wym_y] = {};
int f[wym_x][wym_y] = {};
int direction[wym_x][wym_y];
int openl[wym_x][wym_y];
int h[wym_x][wym_y];
int closel[wym_x][wym_y];


int licz_h(int poz_x, int poz_y) {
	int h = sqrt(pow(poz_x - cel_x, 2) + pow(poz_y - cel_y, 2));
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
		for (int j = 0; j < wym_y; j++){
            h[i][j] = licz_h(i, j);
		}
	}
	for(int i=0;i<wym_x;i++) {
        for(int j=0;j<wym_y;j++)
            cout<<" "<<h[i][j];
        cout<<"\n";
    }
    int X, Y = 0;
	openl[X][Y] = 1;
	for(int i=0;i<wym_x;i++) {
        for(int j=0;j<wym_y;j++)
            cout<<" "<<openl[i][j];
        cout<<"\n";
    }

	while (!(openl[wym_x][wym_y] == NULL)) {
		if (X == cel_x && Y == cel_y) {

			while (!(X == start_x && Y == start_y)) {
				tab[X][Y] = 3;
                if (direction[X][Y] == 1) Y-= 1;
                else if (direction[X][Y] == 2) Y+= 1;
                else if (direction[X][Y] == 3) X+= 1;
                else if (direction[X][Y] == 4) X-= 1;
                tab[X][Y] = 3;



			}
			cout << endl << endl;

			for (int i = 0; i < wym_x; i++)
			{
				for (int j = 0; j < wym_y; j++)
				{
					cout<<" "<<tab[i][j];
				}
				cout << endl;
			}
			for (int i = 0; i < wym_x; i++)
			{
				for (int j = 0; j < wym_y; j++)
				{
					cout<<" "<<openl[i][j];
				}
				cout << endl;
			}



			getchar();
			return 0;
		}
		else {

			openl[X][Y] = 2;

			if (X > 0 && openl[X][Y]!=5) {
				if (tab[X - 1][Y] == 0 && (openl[X - 1][Y] == 0 )) {
					openl[X - 1][Y] = 1;
					g[X - 1][Y] = g[X][Y] + 1;
					f[X-1][Y] = g[X-1][Y] + licz_h(X-1, Y);
					direction[X - 1][Y] = 3;

				}
			}

			if (X < wym_x && openl[X][Y]!=5) {
				if (tab[X + 1][Y] == 0 && (openl[X + 1][Y] == 0 )) {
					openl[X + 1][Y] = 1;
					g[X + 1][Y] = g[X][Y] + 1;
					f[X+1][Y] = g[X+1][Y] + licz_h(X+1, Y);
					direction[X + 1][Y] = 4;


				}
			}
			if (Y > 0 && openl[X][Y]!=5) {
				if (tab[X][Y - 1] == 0 && (openl[X][Y - 1] == 0 )) {
					openl[X][Y - 1] = 1;
					g[X][Y - 1] = g[X][Y] + 1;
					f[X][Y-1] = g[X][Y-1] + licz_h(X, Y-1);
					direction[X][Y - 1] = 2;
				}
			}
			if (Y < wym_y && openl[X][Y]!=5) {
				if (tab[X][Y + 1] == 0 && (openl[X][Y + 1] == 0 )) {
					openl[X][Y + 1] = 1;
					g[X][Y + 1] = g[X][Y] + 1;
					f[X][Y + 1] = g[X][Y+1] + licz_h(X, Y+1);
					direction[X][Y + 1] = 1;
				}
			}
		}
float mini =10000;
			for (int i = 0; i < wym_x; i++) {
			for (int j = 0; j < wym_y; j++) {
				if (openl[i][j] == 1) {
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
