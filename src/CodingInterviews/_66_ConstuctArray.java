package CodingInterviews;

// 构建乘积数组
public class _66_ConstuctArray {

  public int[] multiply(int[] A) {
    int length = A.length;
    int[] B = new int[length];

    // B[i]=A[0]*A[1]*...*A[i-1]
    int ret = 1;
    for (int i = 0; i < length; ret *= A[i++]) B[i] = ret;

    // B[i]*=A[i+1]*...*A[n-1]
    ret = 1;
    for (int i = length - 1; i >= 0; ret *= A[i--]) B[i] *= ret;

    return B;
  }
}
