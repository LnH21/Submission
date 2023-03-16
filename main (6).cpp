#include <iostream>

using namespace std;

int main()
{
    int tgl_lahir [3] = {05,05,2004};
    int *ptgln_lahir;
    for (int i = 0; i<=2; i++){
        ptgln_lahir = &tgl_lahir[i];
    if (i==0){
        cout << "tanggal " <<  *ptgln_lahir;
    } else if (i==1){
        cout << " bulan " << *ptgln_lahir;
    } else if (i==2){
        cout << " tahun " << *ptgln_lahir;
    }
   }
    return 0;
}
