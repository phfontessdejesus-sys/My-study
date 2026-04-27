public class BubbleShort {
    public static void main(int []v){
        for (var i = v.length -1; i > 0; i--)
        {
            var changes = 0;
            for (var j = 0; j < i; j++)
            {
              if (v[j] > v[j + 1])
              {
                  (v[j], v[j + 1]) = (v[j +1], v[j]);
                  changes++;
              }
            }
            if (changes <=1) break;
        }
    }
}
