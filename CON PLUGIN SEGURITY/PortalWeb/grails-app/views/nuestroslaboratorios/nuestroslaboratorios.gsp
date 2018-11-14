<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Portal Web- Contactanos  </title

 
<meta name="viewport" content="width=device-width, initial-scale=1">


<style class="cp-pen-styles">@import url("https://fonts.googleapis.com/css?family=Lora:700");
@import url("https://fonts.googleapis.com/css?family=Open+Sans");
:root {
  --z-distance: 8.519vw;
  --from-left: 1;
  --mobile-bkp: 650px;
}

*, *::before, *::after {
  box-sizing: border-box;
}

body {
  min-height: 100vh;
  margin: 0;
  padding: 0;
  
  font-family: Lora, serif;
  font-size: calc(14px + .3vw);
}

.slider {
  width: 100vw;
  height: 100vh;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-perspective: 1000px;
          perspective: 1000px;
  -webkit-transform-style: preserve-3d;
          transform-style: preserve-3d;
}
.slider::before, .slider::after {
  content: '';
  left: -1vw;
  top: -1vh;
  display: block;
  position: absolute;
  width: 102vw;
  height: 102vh;
  background-position: center;
  background-size: cover;
  will-change: opacity;
  z-index: -1;
  box-shadow: 0 0 0 50vmax rgba(0, 0, 0, 0.7) inset;
}
.slider::before {
  background-image: var(--img-prev);
}
.slider::after {
  -webkit-transition: opacity 0.7s;
  transition: opacity 0.7s;
  opacity: 0;
  background-image: var(--img-next);
}
.slider--bg-next::after {
  opacity: 1;
}
.slider__content {
  margin: auto;
  width: 65vw;
  height: 32.5vw;
  max-height: 60vh;
  will-change: transform;
  -webkit-transform-style: preserve-3d;
          transform-style: preserve-3d;
  pointer-events: none;
  -webkit-transform: translateZ(var(--z-distance));
          transform: translateZ(var(--z-distance));
}
.slider__images {
  overflow: hidden;
  position: absolute;
  width: 100%;
  height: 100%;
  z-index: 0;
  box-shadow: 0 0 5em #000;
}
.slider__images-item {
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  width: 100%;
  will-change: transform;
  -webkit-transition-timing-function: ease-in;
          transition-timing-function: ease-in;
  visibility: hidden;
}
.slider__images-item img {
  display: block;
  position: relative;
  left: -1em;
  top: -1em;
  width: calc(100% + 1em * 2);
  height: calc(100% + 1em * 2);
  -o-object-fit: cover;
     object-fit: cover;
  will-change: transform;
}
.slider__images-item--active {
  z-index: 20;
  visibility: visible;
}
.slider__images-item--subactive {
  z-index: 15;
  visibility: visible;
}
.slider__images-item--next {
  -webkit-transform: translateX(100%);
          transform: translateX(100%);
}
.slider__images-item--prev {
  -webkit-transform: translateX(-100%);
          transform: translateX(-100%);
}
.slider__images-item--transit {
  -webkit-transition: opacity 0.7s, -webkit-transform 3s;
  transition: opacity 0.7s, -webkit-transform 4s;
  transition: transform 0.7s, opacity 0.7s;
  transition: transform 0.7s, opacity 0.7s, -webkit-transform 4s;
}
.slider__text {
  position: relative;
  height: 100%;
}
.slider__text-item {
  position: absolute;
  width: 100%;
  height: 100%;
  padding: 0.5em;
  -webkit-perspective: 1000px;
          perspective: 1000px;
  -webkit-transform-style: preserve-3d;
          transform-style: preserve-3d;
}
.slider__text-item > * {
  overflow: hidden;
  position: absolute;
}
.slider__text-item h3, .slider__text-item p {
  -webkit-transition: -webkit-transform 0.35s ease-out;
  transition: -webkit-transform 0.35s ease-out;
  transition: transform 0.35s ease-out;
  transition: transform 0.35s ease-out, -webkit-transform 0.35s ease-out;
  line-height: 1.5;
  overflow: hidden;
}
.slider__text-item h3 {
  background-color: rgba(255, 255, 255, 0.5);
}
.slider__text-item p {
  font-family: 'Open Sans', sans-serif;
  padding: 1em;
  color: white;
  text-align: center;
  background-color: rgba(0, 0, 0, 0.5);
}
.slider__text-item h3::before, .slider__text-item p::before {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  -webkit-transform: translateX(0);
          transform: translateX(0);
  -webkit-transition: -webkit-transform 0.35s ease-out 0.28s;
  transition: -webkit-transform 0.35s ease-out 0.28s;
  transition: transform 0.35s ease-out 0.28s;
  transition: transform 0.35s ease-out 0.28s, -webkit-transform 0.35s ease-out 0.28s;
}
.slider__text-item h3::before {
  background-color: #000;
}
.slider__text-item p::before {
  background-color: #fff;
}
.slider__text-item h3 {
  margin: 0;
  font-size: 3.5em;
  padding: 0 .3em;
  position: relative;
  font-weight: 700;
  -webkit-transform: translateX(-100%);
          transform: translateX(-100%);
}
.slider__text-item p {
  margin: 0;
  -webkit-transform: translateX(100%);
          transform: translateX(100%);
}
.slider__text-item-head {
  top: -0.5em;
  -webkit-transform: translateZ(3em);
          transform: translateZ(3em);
  -webkit-clip-path: polygon(0 0, 0.5em 100%, 100% 100%, calc(100% - .3em) 0.3em);
          clip-path: polygon(0 0, 0.5em 100%, 100% 100%, calc(100% - .3em) 0.3em);
}
.slider__text-item-info {
  bottom: 0;
  right: 0;
  max-width: 75%;
  min-width: -webkit-min-content;
  min-width: -moz-min-content;
  min-width: min-content;
  -webkit-transform: translateZ(2em);
          transform: translateZ(2em);
  -webkit-clip-path: polygon(0.5em 0, 100% 0%, calc(100% - .5em) 100%, 0 calc(100% - .5em));
          clip-path: polygon(0.5em 0, 100% 0%, calc(100% - .5em) 100%, 0 calc(100% - .5em));
}
.slider__text-item--active h3, .slider__text-item--active p {
  -webkit-transform: translateX(0);
          transform: translateX(0);
}
.slider__text-item--active h3::before {
  -webkit-transform: translateX(100%);
          transform: translateX(100%);
}
.slider__text-item--active p::before {
  -webkit-transform: translateX(-100%);
          transform: translateX(-100%);
}
.slider__text-item--backwards h3::before, .slider__text-item--backwards p::before {
  -webkit-transition: -webkit-transform 0.35s ease-in;
  transition: -webkit-transform 0.35s ease-in;
  transition: transform 0.35s ease-in;
  transition: transform 0.35s ease-in, -webkit-transform 0.35s ease-in;
}
.slider__text-item--backwards h3, .slider__text-item--backwards p {
  -webkit-transition: -webkit-transform 0.35s ease-in 0.35s;
  transition: -webkit-transform 0.35s ease-in 0.35s;
  transition: transform 0.35s ease-in 0.35s;
  transition: transform 0.35s ease-in 0.35s, -webkit-transform 0.35s ease-in 0.35s;
}
.slider__nav {
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  text-align: center;
}
.slider__nav-arrows {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  width: 100%;
  position: absolute;
  top: 0;
  left: 0;
}
.slider__nav-arrow {
  height: 100vh;
  width: 50vw;
  text-indent: -9999px;
  white-space: nowrap;
}
.slider__nav-arrow--left {
  --arrow: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='80' height='80' viewBox='0 0 4 4'%3E %3Cpolyline points='3 1 1 2 3 3' stroke='white' stroke-width='.3' stroke-opacity='.5' fill='none'%3E%3C/polyline%3E %3C/svg%3E");
  cursor: var(--arrow) 40 40, auto;
}
.slider__nav-arrow--right {
  --arrow: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='80' height='80' viewBox='0 0 4 4'%3E %3Cpolyline points='1 1 3 2 1 3' stroke='white' stroke-width='.3' stroke-opacity='.5' fill='none'%3E%3C/polyline%3E %3C/svg%3E");
  cursor: var(--arrow) 40 40, auto;
}
.slider__nav-dots {
  margin-top: 88vh;
  display: -webkit-inline-box;
  display: -ms-inline-flexbox;
  display: inline-flex;
  position: relative;
  padding: 1em;
  pointer-events: none;
}
.slider__nav-dots::before {
  content: '';
  position: absolute;
  left: calc(1em + 1em + 2px);
  top: calc(1em + 2px);
  width: calc(1em - 2px * 2);
  height: calc(1em / 2 - 2px * 2);
  background-color: rgba(255, 255, 255, 0.9);
  -webkit-transition: -webkit-transform 0.7s ease-out;
  transition: -webkit-transform 0.7s ease-out;
  transition: transform 0.7s ease-out;
  transition: transform 0.7s ease-out, -webkit-transform 0.7s ease-out;
  -webkit-transform: translateX(calc((1em + 1em * 2) * (var(--from-left) - 1)));
          transform: translateX(calc((1em + 1em * 2) * (var(--from-left) - 1)));
}
.slider__nav-dot {
  margin: 0 1em;
  width: 1em;
  height: 0.5em;
  border: 2px solid rgba(255, 255, 255, 0.5);
  /* 
    The cursor is not the default one because of a weird bug 
    related to custom cursors above
  */
  cursor: crosshair;
  pointer-events: all;
  display: inline-block;
}
.slider__nav-dot:hover {
  border-color: rgba(255, 255, 255, 0.7);
}
.slider__nav-dot:active {
  border-color: rgba(255, 255, 255, 0.5);
}

@media only screen and (max-width: 650px) {
  .slider::before,
  .slider::after {
    display: none;
  }

  .slider__content {
    width: 100vw;
    height: 100vh;
    max-height: 100vh;
  }

  .slider__text-item-info {
    bottom: 50%;
    left: 50%;
    -webkit-transform: translate(-50%, 50%);
            transform: translate(-50%, 50%);
  }
  .slider__text-item-info p {
    padding: 1em .8em;
  }

  .slider__text-item-head {
    top: 5vh;
    left: 10vw;
    -webkit-transform: translateZ(0);
            transform: translateZ(0);
  }
  .slider__text-item-head h3 {
    font-size: 2.5em;
  }

  .slider__nav-dots {
    background-color: rgba(0, 0, 0, 0.3);
  }

  .slider__nav-arrow {
    width: 10vw;
    position: relative;
    cursor: auto;
  }
  .slider__nav-arrow:active {
    -webkit-filter: brightness(0.5);
            filter: brightness(0.5);
  }
  .slider__nav-arrow::before {
    content: '';
    background-image: var(--arrow);
    background-size: cover;
    width: 8vw;
    height: 8vw;
    position: absolute;
    top: 50%;
    left: 50%;
    -webkit-transform: translate(-50%, -50%);
            transform: translate(-50%, -50%);
  }
  .slider__nav-arrow--left {
    background-image: -webkit-linear-gradient(left, rgba(0, 0, 0, 0.7) 0, transparent 100%);
    background-image: linear-gradient(to right, rgba(0, 0, 0, 0.7) 0, transparent 100%);
  }
  .slider__nav-arrow--left:active {
    background-image: -webkit-linear-gradient(left, rgba(0, 0, 0, 0.9) 0, transparent 100%);
    background-image: linear-gradient(to right, rgba(0, 0, 0, 0.9) 0, transparent 100%);
  }
  .slider__nav-arrow--right {
    background-image: -webkit-linear-gradient(right, rgba(0, 0, 0, 0.7) 0, transparent 100%);
    background-image: linear-gradient(to left, rgba(0, 0, 0, 0.7) 0, transparent 100%);
  }
  .slider__nav-arrow--right:active {
    background-image: -webkit-linear-gradient(right, rgba(0, 0, 0, 0.9) 0, transparent 100%);
    background-image: linear-gradient(to left, rgba(0, 0, 0, 0.9) 0, transparent 100%);
  }
}
</style>
  
   
</head>


<body >


<div class="slider" id="slider" style="--img-prev:url(https://ecoinventos.com/wp-content/uploads/2018/08/Laboratorio.jpg)"> 
  <div class="slider__content" id="slider-content">
    <div class="slider__images">
      <div class="slider__images-item slider__images-item--active" data-id="1"><img src="https://ecoinventos.com/wp-content/uploads/2018/08/Laboratorio.jpg"/></div>
      <div class="slider__images-item" data-id="2"><img src="http://www.casareal.es/sitios/ListasAux/Galeras/20090717_portugal/20090717_inl_3.jpg"/></div>
      <div class="slider__images-item" data-id="3"><img src="http://elcrisol.com.mx/wp-content/uploads/2017/06/instrumentos-de-laboratorio-3-4.jpg"/></div>
      <div class="slider__images-item" data-id="4"><img src="http://www.ltlevante.com/archivos_subidos/02_fisico-quimico.jpg"/></div>
      <div class="slider__images-item" data-id="5"><img src="http://www.farestaie.com/img/varias/img1415.jpg"/></div>
    </div>
    <div class="slider__text">
      <div class="slider__text-item slider__text-item--active" data-id="1">
        <div class="slider__text-item-head">
          <h3>Nuestro Laboratorio</h3>
        </div>
        <div class="slider__text-item-info">
          <p>“Portal Web - Heredia / Rolon”</p>
        </div>
      </div>
      <div class="slider__text-item" data-id="2">
        <div class="slider__text-item-head">
          <h3>Esto es PortalWeb</h3>
        </div>
        <div class="slider__text-item-info">
          <p>“Trabajo de Laboratorio Programacion III”</p>
        </div>
      </div>
      <div class="slider__text-item" data-id="3">
        <div class="slider__text-item-head">
          <h3>LABORATORIO PGIII</h3>
        </div>
        <div class="slider__text-item-info">
          <p>“kematiasrolon@gmail.com”</p>
        </div>
      </div>
      <div class="slider__text-item" data-id="4">
        <div class="slider__text-item-head">
          <h3>Experiencia</h3>
        </div>
        <div class="slider__text-item-info">
          <p>rogerheredia@gmail.com</p>
        </div>
      </div>
      <div class="slider__text-item" data-id="5">
        <div class="slider__text-item-head">
          <h3>Ingenieria en Informatica</h3>
        </div>
        <div class="slider__text-item-info">
          <p>ROLON / HEREDIA </p>
        </div>
      </div>
    </div>
  </div>
  <div class="slider__nav">
    <div class="slider__nav-arrows">
      <div class="slider__nav-arrow slider__nav-arrow--left" id="left">Derecha</div>
      <div class="slider__nav-arrow slider__nav-arrow--right" id="right">Izquierda</div>
    </div>
    <div class="slider__nav-dots" id="slider-dots">
      <div class="slider__nav-dot slider__nav-dot--active" data-id="1"></div>
      <div class="slider__nav-dot" data-id="2"></div>
      <div class="slider__nav-dot" data-id="3"></div>
      <div class="slider__nav-dot" data-id="4"></div>
      <div class="slider__nav-dot" data-id="5"></div>
    </div>
  </div>
</div>



<script src='//production-assets.codepen.io/assets/common/stopExecutionOnTimeout-b2a7b3fe212eaa732349046d8416e00a9dec26eb7fd347590fbced3ab38af52e.js'></script>
<script >'use strict';

var _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }();

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

/*
  More about this function - 
  https://codepen.io/rachsmith/post/animation-tip-lerp
*/
function lerp(_ref, _ref2) {
  var x = _ref.x;
  var y = _ref.y;
  var targetX = _ref2.x;
  var targetY = _ref2.y;

  var fraction = 0.2;

  x += (targetX - x) * fraction;
  y += (targetY - y) * fraction;

  return { x: x, y: y };
}

var Slider = function () {
  function Slider(el) {
    _classCallCheck(this, Slider);

    var imgClass = this.IMG_CLASS = 'slider__images-item';
    var textClass = this.TEXT_CLASS = 'slider__text-item';
    var activeImgClass = this.ACTIVE_IMG_CLASS = imgClass + '--active';
    var activeTextClass = this.ACTIVE_TEXT_CLASS = textClass + '--active';

    this.el = el;
    this.contentEl = document.getElementById('slider-content');
    this.onMouseMove = this.onMouseMove.bind(this);

    // taking advantage of the live nature of 'getElement...' methods
    this.activeImg = el.getElementsByClassName(activeImgClass);
    this.activeText = el.getElementsByClassName(activeTextClass);
    this.images = el.getElementsByTagName('img');

    document.getElementById('slider-dots').addEventListener('click', this.onDotClick.bind(this));

    document.getElementById('left').addEventListener('click', this.prev.bind(this));

    document.getElementById('right').addEventListener('click', this.next.bind(this));

    window.addEventListener('resize', this.onResize.bind(this));

    this.onResize();

    this.length = this.images.length;
    this.lastX = this.lastY = this.targetX = this.targetY = 0;
  }

  Slider.prototype.onResize = function onResize() {
    var htmlStyles = getComputedStyle(document.documentElement);
    var mobileBreakpoint = htmlStyles.getPropertyValue('--mobile-bkp');

    var isMobile = this.isMobile = matchMedia('only screen and (max-width: ' + mobileBreakpoint + ')').matches;

    this.halfWidth = innerWidth / 2;
    this.halfHeight = innerHeight / 2;
    this.zDistance = htmlStyles.getPropertyValue('--z-distance');

    if (!isMobile && !this.mouseWatched) {
      this.mouseWatched = true;
      this.el.addEventListener('mousemove', this.onMouseMove);
      this.el.style.setProperty('--img-prev', 'url(' + this.images[+this.activeImg[0].dataset.id - 1].src + ')');
      this.contentEl.style.setProperty('transform', 'translateZ(' + this.zDistance + ')');
    } else if (isMobile && this.mouseWatched) {
      this.mouseWatched = false;
      this.el.removeEventListener('mousemove', this.onMouseMove);
      this.contentEl.style.setProperty('transform', 'none');
    }
  };

  Slider.prototype.getMouseCoefficients = function getMouseCoefficients() {
    var _ref3 = arguments.length <= 0 || arguments[0] === undefined ? {} : arguments[0];

    var pageX = _ref3.pageX;
    var pageY = _ref3.pageY;

    var halfWidth = this.halfWidth;
    var halfHeight = this.halfHeight;
    var xCoeff = ((pageX || this.targetX) - halfWidth) / halfWidth;
    var yCoeff = (halfHeight - (pageY || this.targetY)) / halfHeight;

    return { xCoeff: xCoeff, yCoeff: yCoeff };
  };

  Slider.prototype.onMouseMove = function onMouseMove(_ref4) {
    var pageX = _ref4.pageX;
    var pageY = _ref4.pageY;

    this.targetX = pageX;
    this.targetY = pageY;

    if (!this.animationRunning) {
      this.animationRunning = true;
      this.runAnimation();
    }
  };

  Slider.prototype.runAnimation = function runAnimation() {
    if (this.animationStopped) {
      this.animationRunning = false;
      return;
    }

    var maxX = 10;
    var maxY = 10;

    var newPos = lerp({
      x: this.lastX,
      y: this.lastY
    }, {
      x: this.targetX,
      y: this.targetY
    });

    var _getMouseCoefficients = this.getMouseCoefficients({
      pageX: newPos.x,
      pageY: newPos.y
    });

    var xCoeff = _getMouseCoefficients.xCoeff;
    var yCoeff = _getMouseCoefficients.yCoeff;

    this.lastX = newPos.x;
    this.lastY = newPos.y;

    this.positionImage({ xCoeff: xCoeff, yCoeff: yCoeff });

    this.contentEl.style.setProperty('transform', '\n      translateZ(' + this.zDistance + ')\n      rotateX(' + maxY * yCoeff + 'deg)\n      rotateY(' + maxX * xCoeff + 'deg)\n    ');

    if (this.reachedFinalPoint) {
      this.animationRunning = false;
    } else {
      requestAnimationFrame(this.runAnimation.bind(this));
    }
  };

  Slider.prototype.positionImage = function positionImage(_ref5) {
    var xCoeff = _ref5.xCoeff;
    var yCoeff = _ref5.yCoeff;

    var maxImgOffset = 1;
    var currentImage = this.activeImg[0].children[0];

    currentImage.style.setProperty('transform', '\n      translateX(' + maxImgOffset * -xCoeff + 'em)\n      translateY(' + maxImgOffset * yCoeff + 'em)\n    ');
  };

  Slider.prototype.onDotClick = function onDotClick(_ref6) {
    var target = _ref6.target;

    if (this.inTransit) return;

    var dot = target.closest('.slider__nav-dot');

    if (!dot) return;

    var nextId = dot.dataset.id;
    var currentId = this.activeImg[0].dataset.id;

    if (currentId == nextId) return;

    this.startTransition(nextId);
  };

  Slider.prototype.transitionItem = function transitionItem(nextId) {
    var _this = this;

    function onImageTransitionEnd(e) {
      e.stopPropagation();

      nextImg.classList.remove(transitClass);

      self.inTransit = false;

      this.className = imgClass;
      this.removeEventListener('transitionend', onImageTransitionEnd);
    }

    var self = this;
    var el = this.el;
    var currentImg = this.activeImg[0];
    var currentId = currentImg.dataset.id;
    var imgClass = this.IMG_CLASS;
    var textClass = this.TEXT_CLASS;
    var activeImgClass = this.ACTIVE_IMG_CLASS;
    var activeTextClass = this.ACTIVE_TEXT_CLASS;
    var subActiveClass = imgClass + '--subactive';
    var transitClass = imgClass + '--transit';
    var nextImg = el.querySelector('.' + imgClass + '[data-id=\'' + nextId + '\']');
    var nextText = el.querySelector('.' + textClass + '[data-id=\'' + nextId + '\']');

    var outClass = '';
    var inClass = '';

    this.animationStopped = true;

    nextText.classList.add(activeTextClass);

    el.style.setProperty('--from-left', nextId);

    currentImg.classList.remove(activeImgClass);
    currentImg.classList.add(subActiveClass);

    if (currentId < nextId) {
      outClass = imgClass + '--next';
      inClass = imgClass + '--prev';
    } else {
      outClass = imgClass + '--prev';
      inClass = imgClass + '--next';
    }

    nextImg.classList.add(outClass);

    requestAnimationFrame(function () {
      nextImg.classList.add(transitClass, activeImgClass);
      nextImg.classList.remove(outClass);

      _this.animationStopped = false;
      _this.positionImage(_this.getMouseCoefficients());

      currentImg.classList.add(transitClass, inClass);
      currentImg.addEventListener('transitionend', onImageTransitionEnd);
    });

    if (!this.isMobile) this.switchBackgroundImage(nextId);
  };

  Slider.prototype.startTransition = function startTransition(nextId) {
    function onTextTransitionEnd(e) {
      if (!e.pseudoElement) {
        e.stopPropagation();

        requestAnimationFrame(function () {
          self.transitionItem(nextId);
        });

        this.removeEventListener('transitionend', onTextTransitionEnd);
      }
    }

    if (this.inTransit) return;

    var activeText = this.activeText[0];
    var backwardsClass = this.TEXT_CLASS + '--backwards';
    var self = this;

    this.inTransit = true;

    activeText.classList.add(backwardsClass);
    activeText.classList.remove(this.ACTIVE_TEXT_CLASS);
    activeText.addEventListener('transitionend', onTextTransitionEnd);

    requestAnimationFrame(function () {
      activeText.classList.remove(backwardsClass);
    });
  };

  Slider.prototype.next = function next() {
    if (this.inTransit) return;

    var nextId = +this.activeImg[0].dataset.id + 1;

    if (nextId > this.length) nextId = 1;

    this.startTransition(nextId);
  };

  Slider.prototype.prev = function prev() {
    if (this.inTransit) return;

    var nextId = +this.activeImg[0].dataset.id - 1;

    if (nextId < 1) nextId = this.length;

    this.startTransition(nextId);
  };

  Slider.prototype.switchBackgroundImage = function switchBackgroundImage(nextId) {
    function onBackgroundTransitionEnd(e) {
      if (e.target === this) {
        this.style.setProperty('--img-prev', imageUrl);
        this.classList.remove(bgClass);
        this.removeEventListener('transitionend', onBackgroundTransitionEnd);
      }
    }

    var bgClass = 'slider--bg-next';
    var el = this.el;
    var imageUrl = 'url(' + this.images[+nextId - 1].src + ')';

    el.style.setProperty('--img-next', imageUrl);
    el.addEventListener('transitionend', onBackgroundTransitionEnd);
    el.classList.add(bgClass);
  };

  _createClass(Slider, [{
    key: 'reachedFinalPoint',
    get: function get() {
      var lastX = ~ ~this.lastX;
      var lastY = ~ ~this.lastY;
      var targetX = this.targetX;
      var targetY = this.targetY;

      return (lastX == targetX || lastX - 1 == targetX || lastX + 1 == targetX) && (lastY == targetY || lastY - 1 == targetY || lastY + 1 == targetY);
    }
  }]);

  return Slider;
}();

var sliderEl = document.getElementById('slider');
var slider = new Slider(sliderEl);

// ------------------ Demo stuff ------------------------ //

var timer = 0;

function autoSlide() {
  requestAnimationFrame(function () {
    slider.next();
  });

  timer = setTimeout(autoSlide, 5000);
}

function stopAutoSlide() {
  clearTimeout(timer);

  this.removeEventListener('touchstart', stopAutoSlide);
  this.removeEventListener('mousemove', stopAutoSlide);
}

sliderEl.addEventListener('mousemove', stopAutoSlide);
sliderEl.addEventListener('touchstart', stopAutoSlide);

timer = setTimeout(autoSlide, 2000);
//# sourceURL=pen.js
</script>






















</body>
</html>
