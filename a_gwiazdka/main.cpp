#include <fstream>
#include <iostream>
#include <math.h>

using namespace std;

const int wym_x = 21;
const int wym_y = 21;
const int start_x = 1;
const int start_y = 1;
const int cel_x = 20;
const int cel_y = 20;
double g[wym_x][wym_y] = {}; //tablica z kosztami poszczegolnych ruchow
double f[wym_x][wym_y] = {}; //tablica f = g + h
int dir[wym_x][wym_y]; //tablica z kierunkami
int lista[wym_x][wym_y]; //tablica z odwiedzonymi elementami
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
void powrot(int x, int y) {
    while (!(x == start_x && y == start_y)) { //rysowanie sciezki
        tab[x][y] = 3;
        switch (dir[x][y]) { //powrot w cztery strony
            case 1:
                x -= 1;
                break;
            case 2:
                x += 1;
                break;
            case 3:
                y -= 1;
                break;
            case 4:
                y += 1;
                break;
        }
        tab[x][y] = 3;
    }
}
int main() {
    string nazwa="grid.txt";

    ifstream plik(nazwa);
    for(int i=1;i<wym_x;i++)
        for(int j=1;j<wym_y;j++)
            plik>>tab[i][j];
    plik.close();

    int x = start_x; //deklaracja elementow ktore beda skladaly sie na sciezke
    int y = start_y;
	lista[start_x][start_y] = 1;
    if (tab[start_x][start_y] == 5 || tab[cel_x][cel_y] == 5) { //sprawdzenie czy nie jestesmy na scianie
        cout<<"Start lub cel znajduje sie na scianie!"<<endl;
        return 0;
    }
    if (start_x == cel_x && start_y == cel_y) { //sprawdzenie czy start jest w celu
        cout<<"Jestes juz u celu"<<endl;
        return 0;
    }
    if (start_x < 0 || start_y > wym_x || start_y < 0 || start_x > wym_y || cel_x < 0 || cel_y > wym_x || cel_y < 0 || cel_x > wym_y) { //sprawdzenie czy jestesmy na mapie
        cout<<"Jestes poza mapa"<<endl;
        return 0;
    }
	while (!(lista[start_x][start_y] == 0)) { //rozpoczecie algorytm
        lista[x][y] = INT_MIN; //wartosc dla listy ktora bedzie oznaczac odwiedzony element
        if (tab[x + 1][y] == 0 && lista[x + 1][y] == 0) { //poruszanie sie w cztery strony
            g[x + 1][y] = g[x][y] + 1; //zwiekszenie wartosci kosztu ruchu
            f[x + 1][y] = g[x + 1][y] + licz_h(x + 1, y); //obliczenie f = g + h
            dir[x + 1][y] = 1; //przypisanie kierunku
            lista[x + 1][y] = 1; //oznaczamy jako element odwiedzany
        }
        if (tab[x - 1][y] == 0 && lista[x - 1][y] == 0) {
            g[x - 1][y] = g[x][y] + 1;
            f[x - 1][y] = g[x - 1][y] + licz_h(x - 1, y);
            dir[x - 1][y] = 2; //przypisanie wartosci do kazdego kierunku
            lista[x - 1][y] = 1;
        }
        if (tab[x][y + 1] == 0 && lista[x][y + 1] == 0) {
            g[x][y + 1] = g[x][y] + 1;
            f[x][y + 1] = g[x][y + 1] + licz_h(x, y + 1);
            dir[x][y + 1] = 3;
            lista[x][y + 1] = 1;
        }
        if (tab[x][y - 1] == 0 && lista[x][y - 1] == 0) {
            g[x][y - 1] = g[x][y] + 1;
            f[x][y - 1] = g[x][y - 1] + licz_h(x, y - 1);
            dir[x][y - 1] = 4;
            lista[x][y - 1] = 1;
        }
        double mini = INT_MAX; //szukanie najmniejszych wartosci
        for (int i = 1; i < wym_x; i++) {
			for (int j = 1; j < wym_y; j++) {
				if (lista[i][j] == 1 && tab[i][j] != 5) {
					if (mini >= f[i][j]) {
						mini = f[i][j];
						x = i;
						y = j;
					}
				}
			}
		}
		if (mini == INT_MAX) { //jesli nie mozna wyszukac najmniejszej wartosci to nie da sie znalezc sciezki
            cout<<"Nie da sie znalezc sciezki"<<endl;
            return 0;
		}
		if (x == cel_x && y == cel_y) {
			powrot(x, y); //rekonstrukcja sciezki
			wypisz(tab); //wypisanie gotowej sciezki
			return 0;
		}
	}
    return 0;
}
