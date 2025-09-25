function getRandomBrand() {
    const brands = ["adidas", "nike"];
    const randomIndex = Math.floor(Math.random() * brands.length);
    return brands[randomIndex];
}

console.log(getRandomBrand());
