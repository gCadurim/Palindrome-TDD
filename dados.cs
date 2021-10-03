using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Linq;
using System.Text.RegularExpressions;

namespace TestProject
{
    [TestClass]
    public class dados
    {
        [TestMethod]
        public void word()
        {
            //arrange:
            var strInput = "INPUT_AQUI";

            var strLimpa = strInput.Replace(",", "")
                                    .Replace("’", "")
                                    .Replace(" ","")
                                    .Replace(".","")
                                    .Replace("!", "")
                                    .Replace("/", "");

            //act:
            var strInvertida = new string(strLimpa.Reverse().ToArray());
            var palindromo = strLimpa.ToLower() == strInvertida.ToLower();

            //assert:
            Assert.IsNotNull(strInput);
            Assert.IsTrue(palindromo);
        }
    }
}
