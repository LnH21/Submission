#include <iostream>

using namespace std;

int
main ()
{
  int a, b, total, c, d, e, f, g, h, i, j;
  /* 
     total = a++;
     b = ++++c;
     cout<<"total : " << total << " " <<c <<endl;

     bool n = 8 <= 8;
     cout << n;
   */

  a = 2;
  b = 11;

  total = a & b;
  cout << " AND " << total << endl;
  total = a | b;
  cout << " OR " << total << endl;
  total = a ^ b;
  cout << " XOR " << total << endl;
  total = ~a;
  cout << " NOT " << total << endl;
  total = a << 1;
  cout << " SHL " << total << endl;

  return 0;
}
