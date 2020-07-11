package algorithms;

//Done

public class TaumBday 
{
	public static long taumBday(long b, long w, long bc, long wc, long z) 
	{	
		if(bc > wc && (wc + z) < bc)
			return (b * wc) + (w * wc) + (b * z);
		  
		else if(wc > bc && (bc+z) < wc)
			return (b * bc) + (w * bc) + (w * z);

        return (b * bc) + (w * wc);
	}

	public static void main(String[] args) 
	{
		long b =  443463982,
		     w =  833847400,
			 bc = 429734889,
			 wc = 628664883,
			 z =  610875522;
		
		System.out.println(taumBday(b, w, bc, wc, z));
	}
}
