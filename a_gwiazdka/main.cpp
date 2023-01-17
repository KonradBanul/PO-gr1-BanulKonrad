#include <fstream>
#include <iostream>
#include <math.h>

using namespace std;

const int wym_x = 21;
const int wym_y = 21;
const int start_x = 20;
const int start_y = 20;
const int cel_x = 1;
const int cel_y = 3;
double g[wym_x][wym_y] = {}; //tablica z kosztami poszczegolnych ruchow
double f[wym_x][wym_y] = {}; //tablica f = g + h
int direction[wym_x][wym_y]; //tablica z kierunkami
int lista[wym_x][wym_y]; //tablica z odwiedzonymi elementami
double h[wym_x][wym_y]; //tablica z wartosciami z heurystyki
int tab[wym_x][wym_y]; //tablica mapa

double licz_h(int poz_x, int poz_y) { //funkcja liczaca heurystyke
	return sqrt(pow(poz_x - cel_x, 2) + pow(poz_y - cel_y, 2));
}
void wypisz(int tab[wym_x][wym_y]) { //funkcja wypisujaca tablice
    for (int i = 1; i < wym_x; i++) {
        for (int j = 1; j < wym_y; j++) {
            cout<<" "<<tab[i][j];
        }
        cout<<"\n";
    }
    cout<<"\n";
}
int main() {
    string nazwa="grid.txt";

    ifstream plik(nazwa);
    for(int i=1;i<wym_x;i++)
        for(int j=1;j<wym_y;j++)
            plik>>tab[i][j];
    plik.close();

	for (int i = 1; i < wym_x; i++) { //liczenie kazdego elementu z heurystyki
		for (int j = 1; j < wym_y; j++){
            h[i][j] = licz_h(i, j);
		}
	}
    int x = start_x; //deklaracja elementow ktore beda skladaly sie na sciezke
    int y = start_y;
	lista[start_x][start_y] = 1;
    if (tab[start_x][start_y] == 5 || tab[cel_x][cel_y] == 5) { //sprawdzenie czy nie jestesmy na scianie
        cout<<"Start lub cel znajduje sie na scianie!"<<endl;
        return 0;
    }
	while (!(lista[start_x][start_y] == 0)) { //rozpoczecie algorytmu
		if (x == cel_x && y == cel_y) {
			while (!(x == start_x && y == start_y)) { //rysowanie sciezki
				tab[x][y] = 3;
                if (direction[x][y] == 1) y -= 1; //poruszanie sie w cztery strony
                else if (direction[x][y] == 2) y += 1;
                else if (direction[x][y] == 3) x += 1;
                else if (direction[x][y] == 4) x -= 1;
                tab[x][y] = 3;
			}
			wypisz(tab); //wypisanie gotowej sciezki
			break;
		}
		else if (!(x < 0 || y > wym_x || y < 0 || x > wym_y )) { //sprawdzenie czy jestesmy na mapie
			lista[x][y] = 2; //wartosc dla listy ktora bedzie oznaczac odwiedzony element
            if (tab[x][y + 1] == 0 && (lista[x][y + 1] == 0 )) { //poruszanie sie w cztery strony
                lista[x][y + 1] = 1;
                g[x][y + 1] = g[x][y] + 1;
                f[x][y + 1] = g[x][y + 1] + h[x][y + 1];
                direction[x][y + 1] = 1;
            }
            if (tab[x][y - 1] == 0 && (lista[x][y - 1] == 0 )) {
                lista[x][y - 1] = 1;
                g[x][y - 1] = g[x][y] + 1;
                f[x][y - 1] = g[x][y - 1] + h[x][y - 1];
                direction[x][y - 1] = 2;
            }
            if (tab[x - 1][y] == 0 && (lista[x - 1][y] == 0 )) {
                lista[x - 1][y] = 1;
                g[x - 1][y] = g[x][y] + 1;
                f[x - 1][y] = g[x - 1][y] + h[x - 1][y];
                direction[x - 1][y] = 3;
            }
            if (tab[x + 1][y] == 0 && (lista[x + 1][y] == 0 )) {
                lista[x + 1][y] = 1;
                g[x + 1][y] = g[x][y] + 1;
                f[x + 1][y] = g[x + 1][y] + h[x + 1][y];
                direction[x + 1][y] = 4;
            }
        }
        else {
            cout<<"Jestes poza mapa!"<<endl;
            return 0;
        }
        float mini = INT_MAX; //szukanie najmniejszych wartosci
        for (int i = 1; i < wym_x; i++) {
			for (int j = 1; j < wym_y; j++) {
				if (lista[i][j] == 1) {
					if (mini >= f[i][j]) {
						mini = f[i][j];
						x = i;
						y = j;
					}
				}
			}
		}
	}
    return 0;
}
